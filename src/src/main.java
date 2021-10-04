public class main {

    public static void main(String[] args) {

        JTuple t1 = new JTuple(new Integer(1));
        JTupleSpace t = new JTupleSpace(t1);



        Thread P1 = new Thread(){
            public void run(){
                JTuple Pt1 = new JTuple(new Integer(1));
                try {
                    t.EXT(Pt1);
                    t.toString();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                JTuple Pt3 = new JTuple(new Integer(3));
                t.ECR(Pt3);
                t.toString();

            }
        };

        Thread P2 = new Thread(){
            public void run(){
                JTuple Pt2 = new JTuple(new Integer(1));
                try {
                    t.EXT(Pt2);
                    t.toString();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread P3 = new Thread(){
            public void run(){
                JTuple Pt3 = new JTuple(new Integer(3));
                try {
                    t.EXT(Pt3);
                    t.toString();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                JTuple Pt1 = new JTuple(new Integer(1));
                t.ECR(Pt1);
                t.toString();
            }
        };

        P1.start();P2.start();P3.start();

    }

}
