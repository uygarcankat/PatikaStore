import java.util.*;




public class Sort {


    public static void main(String args[]) {

        String team1;
        String team2;
        String s;
        String z;
        boolean result;
        int x;

        Scanner input=new Scanner(System.in);

        List<String> arraylist=new ArrayList<>();
        List<String> arraylist2=new ArrayList<>();
        List<String> arraylist3=new ArrayList<>();
        List<String> arraylist4=new ArrayList<>();



        System.out.println("Fiksürde kaç takım var");

        int team_num= input.nextInt();

        for(int i=1; i<=team_num;i++){



            System.out.println("Lütfen takım ismi giriniz");
            arraylist.add(input.next());
        }

        if(team_num % 2 !=0){
            arraylist.add("Bay");
            team_num++;
        }


        int match_num=1;

        for (int t = 0; t < 2; t++) {





            System.out.println("-----------------------"+ (t +1) +" DÖNEM---------------------------");



            for (int j = 0; j < team_num - 1; j++) {


                arraylist2.clear();


                result = true;

                System.out.println("---------Round" + (match_num ++) + "----------");

                for (int i = 0; i < team_num / 2; i++) {


                    result =true;

                    do {



                        do {

                            x = (int) (Math.random() * 6);
                            Collections.shuffle(arraylist);
                            team1 = arraylist.get(x);

                        }

                        while( arraylist2.contains(team1));




                        do {

                            Collections.shuffle(arraylist);
                            x= (int) (Math.random() * 6);
                            team2 = arraylist.get(x);

                        }

                        while (team1.equals(team2) || arraylist2.contains(team2));




                        s = team1 + team2;
                        z = team2 + team1;



                        if (((arraylist3.contains(s) || arraylist3.contains(z))) && (t==0)) {


                            arraylist2.clear();

                            i=0;

                        }

                        else if((arraylist4.contains(s)) && (t==1)){



                            arraylist2.clear();

                            i=0;
                        }


                        else{

                            result = false;

                        }


                    }
                    while (result);



                    arraylist2.add(team1);
                    arraylist2.add(team2);





                    if(arraylist2.size()==team_num){

                        for(int u =0 ; u<team_num-1 ; u++){

                            System.out.println(arraylist2.get(u) + " vs " + arraylist2.get(u+1));

                            u++;

                        }

                        for(int u =0 ; u<team_num-1 ; u++){

                           s=arraylist2.get(u) + arraylist2.get(u+1);
                            arraylist3.add(s);
                            arraylist4.add(s);


                           z=arraylist2.get(u+1) + arraylist2.get(u);
                            arraylist3.add(z);

                            u++;

                        }

                        arraylist2.clear();

                    }
                }
            }
        }
    }
}






