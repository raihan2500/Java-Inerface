package temp;

public interface B {
    double getWidth();

    static B highest(B[] objects){
        if(objects.length == 0){
            return null;
        }
        B highest = objects[0];
        for(var obj : objects){
            if(obj.getWidth() > highest.getWidth()){
                highest = obj;
            }
        }
        return highest;
    }
}
