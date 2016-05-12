void setup(){
size (700,700);
PImage face = loadImage("NyanCat.png");
image (face, 0, 0);
}
void draw(){
ellipse(179, 200, 65, 70);
ellipse(329, 200, 65, 70);
 fill(mouseX, mouseY, 255);
ellipse(179, 200, 45, 50);
ellipse(329, 200, 45, 50);
 fill(0);
ellipse(179, 200, 10, 10);
ellipse(329, 200, 10, 10);
 fill(255, 255, 255);
}