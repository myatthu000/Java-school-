// Rectangle
package Rectangle;
public class Rectangle {
    
    private float Length;
    private float Width;
    public Rectangle(){
        Length=1;
        Width=1;
    }

    public float getLength(){
        return Length;
    }
    public void setLength(float l){
        if(l>0.0 && l< 20.0){
            Length = l;
        }
    }

    public float getWidth(){
        return Width;
    }
    public void setWidth(float w){
        if(w>0.0 && w<20.0){
            Width = w;
        }
    }

    public float Area(){
        return Length*Width;
    }
    public float Perimeter(){
        return 2*(Length + Width);
    }
}
