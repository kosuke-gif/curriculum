/**
 * Task1-4: �ۑ���e
 *
 * ���O�C���@�\���C���[�W���ď����������Ă݂܂��傤�I
 * �E�A�J�E���g���Ƃ��ăf�[�^�x�[�X�ɓo�^����Ă�����
 * �@���O�Falice
 * �@�p�X���[�h�Falice123
 * �{�ۑ�ł́A���ׂĂ̒萔(���v�U���)���g���Aif���̎g�����Ɋ���Ă����܂��傤�I
 * ��@ ? ��D�܂ŉ񓚂��肢���܂��I
 *
 */
public class Task1_4 {

    // �萔�i�A�J�E���g���j
    // �@ �o�^����Ă��閼�O�iUSER_NAME�j�ƃp�X���[�h�iUSER_PASSWORD�j��萔�Œ�`���Ă��������B
    private static final String USER_NAME = "alice";
    private static final String USER_PASSWORD = "alice123";

    // �萔�i���b�Z�[�W�j
    private static final String CONST_MSG_SUCCESS = "���O�C�������ł��B";
    private static final String CONST_MSG_ERROR_NAME = "���O�Ɍ�肪����܂��B";
    private static final String CONST_MSG_ERROR_PASS = "�p�X���[�h�Ɍ�肪����܂��B";
    private static final String CONST_MSG_ERROR_INPUT = "���͏��Ɍ�肪����܂��B";

    // �⑫:
    //   �萔�͇A?�D�Ŏg���񂷂��߂ɒ�`���Ă����܂��B
    //   final�C���q��t�^����ƁA�ϐ��i���I�ɕς��l�j�ł͂Ȃ��A�萔�i�ύX�s�Ȓ�܂����l�j�ƂȂ�܂��B
    //   �u�����֋L�q�v�����֓K���Ȓl���L�q���܂��傤�B
    //   ���ڂ�����Java2�͂ɂďЉ�܂��B

    public static void main(String[] args) {
        // �ȉ��̕ϐ��uname�v�upass�v���g�p���āA�A?�D�̏����𖞂����������L�q���Ă��������B
        // name��pass�̓��O�C����ʂ���̓��͒l���Ƒz�肵�Ă݂܂��傤�B


         String name = "alice";
         String pass = "alice123";


        // �A �uname�v�̒l���uUSER_NAME�v�Ɠ������A�u pass �v�̒l���uUSER_PASSWORD�v�Ɠ������ꍇ�B
        //      �萔���g�p���āu ���O�C�������ł� �v�Əo�͂��Ă��������B
        if((name == USER_NAME) && (pass == USER_PASSWORD)){
            System.out.println(CONST_MSG_SUCCESS);
        }
        // �B �uUSER_RNAME�v�̒l�̂ݓ������ꍇ�B
       //     �萔���g�p���āu �p�X���[�h�Ɍ�肪����܂��B �v �Əo�͂��Ă��������B
       if((name == USER_NAME) && (pass != USER_PASSWORD)){
        System.out.println(CONST_MSG_ERROR_PASS);
    }
        // �C �uUSER_PASSWORD�v�̒l�̂ݓ������ꍇ�B
       //�萔���g�p���āu ���O�Ɍ�肪����܂��B �v�Əo�͂��Ă��������B
       if((name != USER_NAME) && (pass == USER_PASSWORD)){
        System.out.println(CONST_MSG_ERROR_NAME);
    }

        // �D �uUSER_NAME�v���uUSER_PASSWORD�v�̒l���Ԉ���Ă����ꍇ�B 
       //�萔���g�p���āu ���͏��Ɍ�肪����܂��B �v�Əo�͂��Ă��������B
        if((name != USER_NAME) && (pass != USER_PASSWORD)){
            System.out.println(CONST_MSG_ERROR_INPUT);
    
    }

    }

}