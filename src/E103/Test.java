package E103;

public class Test {

    static Data sum(Data[] arr){
        if(arr.length == 0){
           return null;
        }
        Data highest = arr[0];
        for(var obj : arr){
            if(obj.getMeasure() > highest.getMeasure()){
                highest = obj;
            }
        }
        return highest;
    }

    public static void main(String[] args) {
        Person arr[] = {
                new Person("Raihan", 5.6),
                new Person("Bulbul", 5.7),
                new Person("Akib", 5.9)
        };

        Data tallest = Data.tallest(arr);

        System.out.println(tallest);
        System.out.println(Data.average(arr));

        Data highest = sum(arr);
        System.out.println(highest);




    }
}
