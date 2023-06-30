import java.util.Stack;

public class insert
{
    public static void main(String[] args)
    {
        Stack<Integer> st=new Stack<>();
        st.push(21);
        st.push(32);
        st.push(54);
        st.push(43);
        System.out.print(st);

        int idx=2;
        int x=5;
        Stack<Integer> ib=new Stack<>();
        while(st.size()>idx){
            ib.push(st.pop());
        }
        st.push(x);
        while(ib.size()>0){
            st.push(ib.pop());
        }
        System.out.println();
        System.out.print(st);
    }
}