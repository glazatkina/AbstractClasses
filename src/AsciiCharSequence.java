/**
 * Created by Natalya on 05.07.2016.
 *
 * Realisation of interface CharSequense for shorter Ascii symbols string
 */

import java.lang.CharSequence;

public class AsciiCharSequence implements CharSequence {

    private byte[] arr;

    @Override
    public int length() {
        return arr.length;
    }

    @Override
    public char charAt(int index) {
        return (char) arr[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        byte[] arr2 = new byte[end-start];
        for (int i = start; i < end; i++) {
            arr2[i-start] = arr[i];
        }
        return new AsciiCharSequence(arr2);
    }

    @Override
    public String toString() {
        StringBuffer res = new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            res.append((char) arr[i]);
        }
        return res.toString();
    }

    public AsciiCharSequence(byte[] arr) {
        this.arr = new byte[arr.length];
        this.arr = arr;
    }
}
