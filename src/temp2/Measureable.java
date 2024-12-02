package temp2;

import E101.Measurable;

public interface Measureable <T> {
    T getMeasure();

    static Measurable largest(Measurable[] arr){
        if(arr.length == 0)return null;
        Measurable larg = arr[0];

        for(var i : arr){
            if(i.getMeasure() > larg.getMeasure()){
                larg = i;
            }
        }
        return larg;
    }
}
