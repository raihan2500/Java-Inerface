package E103;

public interface Data {
    double getMeasure();

    static double average(Data[] objects){
        if(objects == null || objects.length == 0){
            return 0;
        }

        double total = 0;
        for(Data obj : objects){
            total += obj.getMeasure();
        }
        return total / objects.length;
    }

    static Data tallest(Data[] objects){
        if(objects == null || objects.length == 0){
            return null;
        }
        Data tallest = objects[0];
        for(Data obj : objects){
            if(obj.getMeasure() > tallest.getMeasure()){
                tallest = obj;
            }
        }
        return tallest;
    }

}
