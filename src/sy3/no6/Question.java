package sy3.no6;

import java.io.ObjectInputStream;
import java.util.Arrays;

public  class  Question {
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
        System.out.println(Arrays.toString(options));
    };

    protected boolean check(char answers) {
        return false;
    }
}
