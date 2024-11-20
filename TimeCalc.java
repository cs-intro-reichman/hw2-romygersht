public class TimeCalc {
    public static void main(String[] args) { 

                // reciving the inputs 
                int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
                // Does the same with the minutes part of the input.
                int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
                //input for the minutes to add
                int minutesToAdd = Integer.parseInt(args[1]);
                
                int Tminutes = (hours*60) +minutes+minutesToAdd;
                int Thours = Tminutes/60;
                int Nhours = Thours % 24;
                int Nminutes = Tminutes - (Thours*60);

            /*  System.out.println("Hours: "+hours);
                System.out.println("Minutes: "+minutes);
                System.out.println("Minutes to add: "+minutesToAdd);
                System.out.println("New Hours: "+Nhours);
                System.out.println("New Minutes: "+Nminutes); */
                
                if (Nhours<10) {   
                if (Nminutes<10){
                System.out.println("0"+Nhours+":"+"0"+Nminutes); 
                }
                else {
                System.out.println("0"+Nhours+":"+Nminutes); 
                }
                             }
                else { //Nhours>=10
                if (Nminutes<10){
                System.out.println(Nhours+":"+"0"+Nminutes); 
                }   
                else { 
                System.out.println(Nhours+":"+Nminutes);  
                }
                    }

    }
}
