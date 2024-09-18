package app;

import java.util.List;

public interface PrinterUser<T extends User> {

    void printAll(List<T> list);
    void printOne(T one);

}
