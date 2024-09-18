package app;

//интерфейс "маркер" для классов "шаблонов" компаратора - для реализации D принципа SOLID

import java.util.Comparator;

public interface UsersComparator<T extends User> extends Comparator<T> {

}
