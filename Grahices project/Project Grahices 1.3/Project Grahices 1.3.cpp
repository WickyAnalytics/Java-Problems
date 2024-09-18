#include <windows.h>
#include <cstdlib>
#include <iostream>
#include "GL/glut.h"
#include "GL/glu.h"
#include "GL/gl.h" 
#include <math.h>

//#define PI 3.14159265f
int c;
using namespace std;


void setTransformation(int w, int h) {
	glViewport(0, 0, w, h);
	glMatrixMode(GL_PROJECTION);
	glLoadIdentity();
	gluPerspective(65, (GLdouble)w / h, 0.1, 20);
	glMatrixMode(GL_MODELVIEW);
	glutPostRedisplay();
}

GLdouble yBody = 0;
GLdouble angle1 = 0;
GLdouble angle2 = 0;

void CreateBody()
{

	glTranslatef(0, yBody, 0); //used for the jump moviment

	glPushMatrix();
	//---------------------------------------------
	glPushMatrix();//back leg
	glTranslatef(5.15, -1.7, 7.1);
	glTranslatef(0, 0.5, 0);
	glRotatef(angle2, 1, 0, 0);
	glTranslatef(0, -0.5, 0);

	glColor3f(1, 0, 0);
	glScalef(0.4, 2, 0.5);
	glutSolidCube(0.5);
	glColor3f(1, 1, 1);
	glutWireCube(0.5000);
	glPopMatrix();
	//---------------------------------------------
	glPushMatrix();//back arm
	glTranslatef(5.45, -0.8, 7.1);
	glTranslatef(0, 0.5, 0);
	glRotatef(angle1, 1, 0, 0);
	glTranslatef(0, -0.5, 0);

	glColor3f(1, 0, 0);
	glScalef(0.4, 2, 0.5);
	glutSolidCube(0.5);
	glColor3f(1, 1, 1);
	glutWireCube(0.5000);
	glPopMatrix();
	//---------------------------------------------
	glPushMatrix();//front leg
	glTranslatef(4.8, -1.8, 7);
	glTranslatef(0, 0.5, 0);
	glRotatef(angle1, 1, 0, 0);
	glTranslatef(0, -0.5, 0);

	glColor3f(1, 0, 0);
	glScalef(0.4, 2, 0.5);
	glutSolidCube(0.5);
	glColor3f(1, 1, 1);
	glutWireCube(0.5000);
	glPopMatrix();
	//---------------------------------------------
	glPushMatrix();//body
	glTranslatef(5, -0.8, 7);
	glColor3f(1, 0, 0);
	glScalef(1.8, 2, 0.7);
	glutSolidCube(0.5);
	glColor3f(1, 1, 1);
	glutWireCube(0.5000);
	glPopMatrix();
	//---------------------------------------------
	glPushMatrix();//front arm
	glTranslatef(4.45, -0.8, 7);
	glTranslatef(0, 0.5, 0);
	glRotatef(angle2, 1, 0, 0);
	glTranslatef(0, -0.5, 0);
	glColor3f(1, 0, 0);
	glScalef(0.4, 2, 0.5);
	glutSolidCube(0.5);
	glColor3f(1, 1, 1);
	glutWireCube(0.5000);
	glPopMatrix();
	//---------------------------------------------
	glPushMatrix();//head
	glTranslatef(4.9, 0, 7.1);
	glRotatef(0, 0, 1, 0);
	glColor3f(1, 0, 0);
	glutSolidCube(0.5);
	glColor3f(1, 1, 1);
	glutWireCube(0.5000);
	glPopMatrix();
	//---------------------------------------------
	glPopMatrix();
}


float posblock = 15.85;
// for block ---------------------------------------------------------
void block()
{
	posblock -= 0.085;
	//cout << posblock << "pos block" << endl;

	glPushMatrix();
	glTranslatef(5, -1.8, posblock);// (x deepest, y vertical, z horzontal
	glColor3f(0, 1, 0);
	glutSolidCube(1);
	glColor3f(1, 1, 1);
	glutWireCube(1.0001);
	glPopMatrix();

	if (posblock <= 3.15) 
	{
		posblock = 15.85;
	}
}

float posWhiteroad = 12.85;
void Ground()
{

	glPushMatrix();

	glPushMatrix();	//base road
	glTranslatef(5, -3, 7.1);// (x deepest, y vertical, z horzontal)
	glColor3f(0, 0, 0);
	glScalef(3.5, 2, 22);
	glutSolidCube(1);
	glPopMatrix();

	posWhiteroad -= 0.085;
	//for details for road
	glPushMatrix(); //white mark center
	glTranslatef(3.8, -1.2, posWhiteroad);
	glColor3f(1, 1, 1);
	glScalef(0.2, 0.02, 22);
	glutSolidCube(1);
	glPopMatrix();

	glPushMatrix();	//white mark topright
	glTranslatef(4.8, -1.2, posWhiteroad + 4);
	glColor3f(1, 1, 1);
	glScalef(0.1, 0.1, 2);
	glutSolidCube(1);
	glPopMatrix();

	glPushMatrix(); //white mark bottomleft
	glTranslatef(2.8, -1.2, posWhiteroad);
	glColor3f(1, 1, 1);
	glScalef(0.1, 0.1, 2);
	glutSolidCube(1);
	glPopMatrix();
	if (posWhiteroad <= 1.15) {
		posWhiteroad = 20.85;
	}

	glPopMatrix();
}


void myDisplay(void) {
	glClearColor(0.5, 0.5, 0.5, 1.0);
	glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
	glLoadIdentity();
	gluLookAt
	(1, 1, 10,
		5, -1, 10,
		0, 1, 0);

	glPushMatrix();
	Ground();
	glPopMatrix();

	glPushMatrix();
	CreateBody();
	glPopMatrix();

	glPushMatrix();
	block();
	glPopMatrix();

	glutSwapBuffers();
}
//-------------------------------------------------------------------------

GLdouble posY = 4.5;
GLdouble yspeed = 1.2;

bool onGround = true;
bool Jump = false;

//used for body animation function
float theta = 0;
float amplitude = 33;
float period = 200;
float x;

void Physics() {

	if (Jump) {
		onGround = false;

		/*posY += yspeed;
		if (posY > 2.5) {
			posY = 2.5;*/

		yBody = posY * yspeed;
		if (yBody > 5) {
			yBody = 5;
		}
		Jump = false;
		//)
	}

	yBody -= 0.12f;
	// make it on gorund 
	if (yBody < 0) {
		yBody = 0;
		onGround = true;
	}
}
float intpart;
float scoref = 0;
int score = 0;
bool collisionTest = false;

void scoreSystem() {
	if (collisionTest == false ) 
{
		scoref += 0.01;
		if (modf(scoref, &intpart) < 0.01)
		{
			score += 1;
			printf("%d\n", score);
		}
	}
	if (collisionTest) {
		score = 0;
	}
}

void Animation() {

	x = amplitude * cos(theta) * sin(theta);

	angle1 = (angle1 + x) / 2;
	angle2 = (angle2 - x) / 2;

	theta += 0.1;
}
//----------------------------------------------------
bool LoseMenu = false;

void start()
{
	LoseMenu = false;
	collisionTest = false;
}

void collision() 
{
	if (posblock < 8.2 & posblock>4 & onGround == true) 
	{
		collisionTest = true;
		LoseMenu = true;
	}
}

void spaceBar(unsigned char c, int, int) {

	switch (c)
	{
	case ' ':
	{
		Jump = true;
		Physics();
		sndPlaySound(TEXT("JumpSound.wav"), SND_ASYNC);//jump sound
		break;
	}
	}
	glutPostRedisplay();
}

void gameOver() 
{
	if (collisionTest&&LoseMenu)
	{
		printf("\nYOU DIED\n, Do u wanna try aging ?\n 1. Start\n 2. No, i want to exit!\t");
		//Sleep(300);
		int ch;
		scanf_s("%d", &ch);
		switch (ch)
		{
		case 1:void myDisplay();
			c = 1;
			collisionTest = false;
			break;
		case 2:exit(0);
			c = 2;
			break;
		default:printf("invalid choice");
			break;
		}
		//exit(0);
		
	}
}
//-------------------------------------------
#define TEMPO 30
void hardMode()
{
	//posblock -= 1;
	//#define	TEMPO2 1
	myDisplay();
}


void timer(int id)
{
	Physics();
	Animation();
	block();
	collision();
	scoreSystem();
	gameOver();
	glutPostRedisplay();

	glutTimerFunc(TEMPO, timer, 200);
}

int main(int argc, char** argv)
{
	int  ch;
	glutInit(&argc, argv);
	printf("MENU\n1.Start\n2.Hard Mode\n3.Exit\nenter your choice\t");
	scanf_s("%d", &ch);
	switch (ch)
	{
	case 1:void myDisplay();
		sndPlaySound(TEXT("DarkSoulsTheme.wav"), SND_ASYNC);
		c = 1;
		break;
	case 2:void hardMode();
		c = 2;
		break;
	case 3:exit(0);
		break;
	default:printf("invalid choice");
		break;
	}

	glutInit(&argc, argv);
	glutInitDisplayMode(GLUT_DOUBLE | GLUT_RGBA);
	glutInitWindowSize(1280, 720);
	glutInitWindowPosition(350, 50);
	glutCreateWindow(argv[0]);

	glutDisplayFunc(myDisplay);
	glutReshapeFunc(setTransformation);
	glutKeyboardFunc(spaceBar);
	
	glutTimerFunc(TEMPO, timer, 100);
	glutMainLoop();
	return 0;
}