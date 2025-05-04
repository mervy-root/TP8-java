package com.mervy.root;

public class EmprunterException extends Exception {
    public EmprunterException(String message){
        super(message);
    }
    static class IndexOfEmprunterException extends Exception {
        public IndexOfEmprunterException(String s) {
            super(s);
        }
    }

    static class EmprunterLivreException extends Exception {
        public EmprunterLivreException(String s) {
            super(s);
        }
    }
    static class EmprunterPortableException extends Exception {
        public EmprunterPortableException(String s) {
            super(s);
        }
    }

}
