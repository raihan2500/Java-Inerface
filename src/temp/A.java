package temp;

public interface A {
    double getHeight();

    static A highest(A[] objects){
        if(objects.length == 0){
            return null;
        }
        A highest = objects[0];
        for(var obj : objects){
            if(obj.getHeight() > highest.getHeight()){
                highest = obj;
            }
        }
        return highest;
    }
}
