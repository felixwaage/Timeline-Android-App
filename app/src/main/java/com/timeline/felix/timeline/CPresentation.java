package com.timeline.felix.timeline;

import android.support.annotation.NonNull;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by media on 21.05.2018.
 */

public class CPresentation {

    private String name;
    private String description;
    private List<CSlide> slideList;
    private int counter;

    public CPresentation(String name, String description){
        this.setName(name);
        this.setDescription(description);
        slideList = new List<CSlide>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @NonNull
            @Override
            public Iterator<CSlide> iterator() {
                return null;
            }

            @NonNull
            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @NonNull
            @Override
            public <T> T[] toArray(@NonNull T[] ts) {
                return null;
            }

            @Override
            public boolean add(CSlide cSlide) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(@NonNull Collection<?> collection) {
                return false;
            }

            @Override
            public boolean addAll(@NonNull Collection<? extends CSlide> collection) {
                return false;
            }

            @Override
            public boolean addAll(int i, @NonNull Collection<? extends CSlide> collection) {
                return false;
            }

            @Override
            public boolean removeAll(@NonNull Collection<?> collection) {
                return false;
            }

            @Override
            public boolean retainAll(@NonNull Collection<?> collection) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public CSlide get(int i) {
                return null;
            }

            @Override
            public CSlide set(int i, CSlide cSlide) {
                return null;
            }

            @Override
            public void add(int i, CSlide cSlide) {

            }

            @Override
            public CSlide remove(int i) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @NonNull
            @Override
            public ListIterator<CSlide> listIterator() {
                return null;
            }

            @NonNull
            @Override
            public ListIterator<CSlide> listIterator(int i) {
                return null;
            }

            @NonNull
            @Override
            public List<CSlide> subList(int i, int i1) {
                return null;
            }
        };
        counter = 0;
    }

    public void addSlide(int seconds, String title, String description){
        CSlide newSlide = new CSlide(seconds,title,description);
        slideList.add(newSlide);
        counter++;
    }

    public boolean removeItemByTitle(String title){
        for(CSlide current_slide : slideList){
            if(current_slide.getTitel() == title){
                return slideList.remove(current_slide);
            }
        }
        return false;
    }

    public CSlide[] getSlides(){
        return slideList.toArray();
    }

    public int itemCounter(){
        return ((CSlide[]) slideList.toArray()).length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
