package dh.java.patterns.behavioral.chain.v2.processor;

import dh.java.patterns.behavioral.chain.v2.model.ResultDto;
import dh.java.patterns.behavioral.chain.v2.model.MailDto;

import static dh.java.patterns.behavioral.chain.v2.model.MailType.DH;

public class DHProcessor implements MailProcessor{
    private final MailProcessor processor;

    public DHProcessor(){
        this.processor = null;
    }
    public DHProcessor(final MailProcessor processor){
        this.processor = processor;
    }

    @Override
    public ResultDto process(final MailDto mailDto) {

        System.out.println("DH Evaluation");
        if(DH.equals(mailDto.getMailType())){
            return ResultDto.builder()
                    .message("DH")
                    .result(true)
                    .build();
        }

        if(processor!=null){
            return processor.process(mailDto);
        }

        return new NoTypeProcessor().process(mailDto);
    }
}
