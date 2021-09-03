PImage face;
int x = 0;
int y = 0;
void setup() {
  face = loadImage("face.png");
  size(800, 600);
  face.resize(width, height);
}

void draw() {
  background(face);
  fill(255);
  ellipse(516, 261, 250, 250);
  fill(0);
  ellipse(x, y, 150, 150);

  fill(255);
  ellipse(516-235, 261, 250, 250);
  fill(0);
  ellipse(x-235, y, 150, 150);
  if (mouseX<485) {
    x=485;
  } else if (mouseX>552) {
    x=552;
  } else {
    x = mouseX;
  }
  if (mouseY<223) {
    y=223;
  } else if (mouseY>297) {
    y=297;
  } else {
    y = mouseY;
  }
  }
