package sy3.no6;

import java.io.ObjectInputStream;
import java.util.Arrays;

public abstract class  Question {
    String title;
    String[] options=new String[5];

    public String getTitle() {
        return title;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    protected  void print(){
        System.out.println(title);
        System.out.println(Arrays.toString(options));
        System.out.println("你的答案是：");
    };

    protected abstract boolean check(String[] answers);
}
