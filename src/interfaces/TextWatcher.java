package interfaces;

import java.util.Date;

public interface TextWatcher {

    // const declaration
    int id = 1;

    // abstract method declaration
    void afterTextChanged();

    // static method
    static long beforeTextChanged() {
        return new Date().getTime();
    }

    // default method
    default void onTextChanged() {
        System.out.println("I hate change");
    }
}