package stepik_6_1;

public class stepik_6_1_1 {

    class  Pair<T,S> {

        private final T t;
        private final S s;

        private Pair(){
            this.t=null;
            this.s=null;
        }

        private Pair(T t,S s){
            this.t=t;
            this.s=s;
        }

        public T getFirst(){return t;}

        public S getSecond(){ return s;}

        public static <T,S> Pair <T,S> of (T t,S s){ return new Pair <> (t,s);}

        @Override
        public boolean equals(Object obj) {

            if (this == obj) {
                return true;
            }

            if (!(obj instanceof Pair)) {
                return false;
            }

            Pair<?, ?> otherObj = (Pair<?, ?>) obj;
            if ( Objects.equals(otherObj.getFirst(), this.t)&Objects.equals(otherObj.getSecond(), this.s)) {
                return true;
            }
            return false;
        }

        @Override
        public int hashCode() {
            return Objects.hash(t, s);
        }


    }
}
