package quiz;

public class Java42 {
	public static void main(String[] args){
        System.out.println(getGengou("1998/02/27"));
    }

	public static String getGengou(String date){
        if(date.compareTo("1989/01/07") < 0){
            return "平成より前";
        } else if(date.compareTo("2019/05/01") < 0){
            return "平成";
        } else {
            return "令和";
        }
    }
}