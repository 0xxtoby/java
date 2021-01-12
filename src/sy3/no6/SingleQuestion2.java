package sy3.no6;

import java.util.Arrays;

public class SingleQuestion2 extends Question{
    String anwswer;

    public SingleQuestion2(String anwswer,String title,String[] options) {
        this.anwswer = anwswer;
        this.setOptions(options);
        this.setTitle(title);
    }

    public String getAnwswer() {
        return anwswer;
    }

    public void setAnwswer(String anwswer) {
        this.anwswer = anwswer;
    }

    @Override
    protected boolean check(String[] answers) {
        return answers[0].equals(anwswer);
    }
}
