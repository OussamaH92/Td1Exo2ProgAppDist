import java.util.ArrayList;
import java.util.Arrays;

public class JTupleSpace {

    private ArrayList<JTuple> multiEnsemble;

    public JTupleSpace(JTuple... t){
        multiEnsemble = new ArrayList<>(Arrays.asList(t));

       }

    public synchronized void ECR(JTuple t){
        multiEnsemble.add(t);
        notifyAll();
    }

    public synchronized JTuple EXT(JTuple t) throws InterruptedException {

        while(!multiEnsemble.contains(t)){
            wait();
        }

        JTuple temp = t;
        multiEnsemble.remove(t);
        return t;
    }


    public synchronized JTuple LEC(JTuple t) throws InterruptedException {

        while(!multiEnsemble.contains(t)){
            wait();
        }

        JTuple temp = t;
        multiEnsemble.remove(t);
        return t;

    }
    public String toString (){
        return multiEnsemble.toString();
    } }
