package com.amar.ObserverPattern;

/**
 * Created by amarendra on 29/03/15.
 */
// This interface handles adding, deleting and updating
// all observers

public interface Subject {

    public void register(Observer o);
    public void unregister(Observer o);
    public void notifyObserver();

}
