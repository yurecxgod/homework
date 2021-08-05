package hw11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Box<T extends Fruits> {
    private List<T> box;

    public Box() {
        this.box = new ArrayList<>();
    }

    public Box(T... o) {
        this.box = new ArrayList(Arrays.asList(o));
    }

    public ArrayList<T> getBox() {
        return (ArrayList<T>) box;
    }

    public void add(T fruit) {
        box.add(fruit);
    }

    public float getWeight() {
        float fw = 0.0f;
        for (int i = 0; i < box.size(); i++) {
            fw = fw + box.get(i).getWeight();
        }
        return fw;
    }

    public boolean compare(Box<? extends Fruits> boxWithSomething) {
        return Math.abs(getWeight() - boxWithSomething.getWeight()) < 0.01f;
    }

    public void replaceFruits(Box<T> anBox) {
        anBox.box.addAll(this.box);
        this.box.clear();
    }
}
