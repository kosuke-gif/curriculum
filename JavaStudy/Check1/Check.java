
public class Check{
   public static void main(String[] args){
       /*
       * ��1
       * int�^�̔z��data���쐬���A�l��3,1,2,7,5�ŏ��������Ȃ���
       */
       int[] data= { 3, 1, 2, 7, 5 };

       /*
       * ��2
       * �ȉ���for�������������Ȃ���
       */
       for(int i = 0; i < data.length; i++){
           System.out.print(data[i] + " ");
       }
       System.out.println();
       for (int i = 0; i < data.length-1; i++) {
           for (int j = data.length-1;j > i; j--) {
       /*
       * ��3
       * �ȉ��A�z��̓Y�������ă\�[�g�����������Ȃ���
       */
       if(data[j-1] > data[j]){
         int box = data[j];
         data[j] = data[j-1];
         data[j-1] = box;
               }
           }
       }
       for(int i = 0; i < data.length; i++){
           System.out.print(data[i] + " ");
       }
   }
}




