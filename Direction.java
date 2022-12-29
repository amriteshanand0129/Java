import java.util.*;
class Direction{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        //Calculate displacement of coordinate
        
        System.out.println("Enter the direction");
        String dir = in.nextLine();
        int x = 0;
        int y = 0;
        for(int i=0;i<dir.length();i++){
            char ch = dir.charAt(i);
            if(ch=='E')
                x++;
            else if(ch=='N')
                y++;
            else if(ch=='W')
                x--;
            else if(ch=='S')
                y--;
        }
        System.out.println("Final cooridnates="+(x)+","+(y));
        double displacement = Math.sqrt(x*x+y*y);
        System.out.println("Displacement="+displacement);

        //Compression of string

        System.out.println("Enter string to be compressed");
        String str = in.nextLine();
        in.close();
        StringBuilder sb = new StringBuilder();
        int l = str.length();
        for(int i=0;i<l;i++){
            char ch = str.charAt(i);
            int count=1;
            int index = i+1;
            while(index<l){
                if(str.charAt(index)==ch){
                    count++;
                    index++;
                }
                else
                    break;
            }
            i = i+count-1;
            if(count==1)
                sb.append(ch);
            else{
                sb.append(ch);
                sb.append(count);
            }
        }
        System.out.println(sb);
    }
}