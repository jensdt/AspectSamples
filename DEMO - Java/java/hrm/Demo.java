package hrm;

import java.lang.*;
import logging.*;

public class Demo extends java.lang.Object {
    public static void main(String[] args) {
        int no = 1;
        if((args.length) == (4)) {
            no = Integer.parseInt(args[0]);
            AspectConfiguration.ENABLE_EXCEPTION = args[1].equals("1");
            AspectConfiguration.ENABLE_REASSIGN = args[2].equals("1");
            AspectConfiguration.ENABLE_OVERFLOW = args[3].equals("1");
        }
        Demo demo = new Demo();
        Logger.instance().advice_jsjqocot_objkpwku(demo, "start", new Object[]{no}, null);
    }

     public Demo() {
    }

    public void start(int no) {
        if((no) == (0)) {
            Person jan = new Person("Jan");
            Person paul = new Person("Paul");
            Team teamA = new Team("Team A");
            Team teamB = new Team("Team B");
            try {
                Logger.instance().advice_pikkgszc_qupgzqjs(teamA, "addPerson", new Object[]{jan}, this);
                Logger.instance().advice_pikkgszc_qupgzqjs(teamB, "addPerson", new Object[]{jan}, this);
            }
            catch (PersonAlreadyAssignedException e) {
                boolean _$zqakouzr = AspectConfiguration.ENABLE_EXCEPTION;
                if(!(_$zqakouzr)) {
                    e.printStackTrace();
                }
                else {
                    System.err.println("-- Already assigned!");
                }
            }
            System.out.println(("Jan is a member of: ") + (jan.getTeam().getName()));
        }
        if((no) == (1)) {
            int i = 50000;
            System.out.println((("Casting integer ") + (i)) + (" to short"));
            short s = Logger.instance().advice_hfbkbsgg_odcmzcib(i, this);
            System.out.println(("Short s is: ") + (s));
        }
    }

}