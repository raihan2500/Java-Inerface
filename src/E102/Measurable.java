package E102;

public interface Measurable {
    double getScore();

    static double average(Measurable[] objects){
        if(objects == null || objects.length == 0){
            return 0;
        }
        double totalScore = 0;
        for(Measurable obj : objects){
            totalScore += obj.getScore();
        }
        return totalScore / objects.length;
    }

    static Measurable highest(Measurable[] objects){
        if(objects == null || objects.length == 0){
            return null;
        }

        Measurable highest = objects[0];
        for(Measurable obj : objects){
            if(obj.getScore() > highest.getScore()){
                highest = obj;
            }
        }
        return highest;
    }

}
