public class Task1_2 {

    public static void main(String[] args) {

        // �@�uJAPAN�v�A�uAMERICA�v�A�uKOREA�v��v�f�̒l�i�����l�j�Ƃ���z�� country���쐬���Ȃ����B
        String[] country = new String[3];
        country[0] = "JAPAN";
        country[1] = "AMERICA";
        country[2] = "KOREA";
        
        // �A �@�ō쐬�����z��̗v�f�����o�͂��Ă��������B
        System.out.println (country.length);

        /* �B���L�̒l��ێ������A�v�f��3��String�N���X�̔z��strArray���쐬���Ȃ����B
         *   1�Ԗځi�擪�j�̗v�f�� �u��񂲁v ����
         *   2�Ԗڂ̗v�f�� �u�����v ����
         *   3�Ԗڂ̗v�f�� �u�Ԃǂ��v ����
         */
         String strarray[] = {"���","����","�Ԃǂ�"};
        
        // �C �B�ō쐬�����z���2�Ԗڂ̗v�f���o�͂��Ȃ����B
         System.out.println(strarray[1]);

        /* �D���L�̏����ɂ��āA�������Ă���̂��R�����g���L�����Ă��������B
         *  [int[]�^�̕ϐ�intArray�̐錾�Ə�����]
         */
        int[] intArray = { 10, 20, 30, 40, 50 };

        // �E���L�̏����ɂ��āA�������Ă���̂��R�����g���L�����Ă��������B
        // [2�Ԗڂ̗v�f��5�Ԗڂ̗v�f�𑫂��ďo�͂��Ă���B���v70��]
        System.out.println(intArray[1] + intArray[4]);

    }
}