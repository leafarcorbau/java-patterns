package dh.java.patterns.behavioral.chain.v1;


import static dh.java.patterns.behavioral.chain.v1.MailType.*;

public class MailProcessor {

    public ResultDto process(final MailDto mailDto) {

        System.out.println("DW Evaluation");
        if(DW.equals(mailDto.getMailType())){
            return ResultDto.builder()
                    .message("DW")
                    .result(false)
                    .build();
        }

        System.out.println("FACEBOOK Evaluation");
        if(FACEBOOK.equals(mailDto.getMailType())){
            return ResultDto.builder()
                    .message("FACEBOOK")
                    .result(false)
                    .build();
        }

        System.out.println("DH Evaluation");
        if(DH.equals(mailDto.getMailType())){
            return ResultDto.builder()
                    .message("DH")
                    .result(true)
                    .build();
        }

        System.out.println("NO TYPE Evaluation");
        return  ResultDto.builder()
                .message("NO TYPE")
                .result(false)
                .build();
    }
}
