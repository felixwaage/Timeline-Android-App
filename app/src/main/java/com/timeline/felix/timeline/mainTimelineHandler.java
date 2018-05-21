package com.timeline.felix.timeline;

import android.app.Application;
import android.support.annotation.NonNull;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by media on 21.05.2018.
 */

public class mainTimelineHandler extends Application {
    private static List<CPresentation> presentations = new List<CPresentation>() {
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
        public Iterator<CPresentation> iterator() {
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
        public boolean add(CPresentation cPresentation) {
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
        public boolean addAll(@NonNull Collection<? extends CPresentation> collection) {
            return false;
        }

        @Override
        public boolean addAll(int i, @NonNull Collection<? extends CPresentation> collection) {
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
        public CPresentation get(int i) {
            return null;
        }

        @Override
        public CPresentation set(int i, CPresentation cPresentation) {
            return null;
        }

        @Override
        public void add(int i, CPresentation cPresentation) {

        }

        @Override
        public CPresentation remove(int i) {
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
        public ListIterator<CPresentation> listIterator() {
            return null;
        }

        @NonNull
        @Override
        public ListIterator<CPresentation> listIterator(int i) {
            return null;
        }

        @NonNull
        @Override
        public List<CPresentation> subList(int i, int i1) {
            return null;
        }
    };
    private static CPresentation lastSelected;

    public static void addPresentation(CPresentation cPresentation){
        presentations.add(cPresentation);
        lastSelected = cPresentation;
    }

    public static CPresentation getLastSelected(){
        return lastSelected;
    }

}
