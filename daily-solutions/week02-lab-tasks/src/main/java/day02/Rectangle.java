package day02;

public class Rectangle {
    int oldalA;
    int oldalB;

    public Rectangle(int oldalA, int oldalB) {
        this.oldalA = oldalA;
        this.oldalB = oldalB;
    }
    public int calculateAB(){
        return oldalA*oldalB;
    }
}
