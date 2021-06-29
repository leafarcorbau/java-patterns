package dh.java.patterns.behavioral.observer.v2;

import dh.java.patterns.behavioral.observer.v2.display.Observer;

public interface Subject {

    void addObserver(final Observer observer);
    void removeObserver(final Observer observer);
    void notifyObservers();
}
