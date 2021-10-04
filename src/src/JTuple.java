import java.util.ArrayList;
import java.util.Objects;

public class JTuple {

    private ArrayList<Object> element = new ArrayList<>();

    public JTuple(Object... element) {
        this.element.add(element);
    }

    public ArrayList<Object> getElement() {
        return element;
    }

    public boolean match(JTuple o) {
            return o.getElement().equals(element);
    }

    public void add (Object e){
            this.element.add(e);
    }

    @Override
    public boolean equals(Object o) {
        JTuple temp = (JTuple) o;
        return temp.getElement().equals(element);
    }

    @Override
    public String toString () {
            return this.getElement().toString();
        }
    }

