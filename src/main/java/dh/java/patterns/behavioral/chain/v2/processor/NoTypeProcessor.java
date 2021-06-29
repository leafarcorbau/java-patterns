package dh.java.patterns.behavioral.chain.v2.processor;

import dh.java.patterns.behavioral.chain.v2.model.MailDto;
import dh.java.patterns.behavioral.chain.v2.model.ResultDto;

import static dh.java.patterns.behavioral.chain.v2.model.MailType.DH;

public class NoTypeProcessor implements MailProcessor{
    private final MailProcessor processor;

    public NoTypeProcessor(){
        this.processor = null;
    }
    public NoTypeProcessor(final MailProcessor processor){
        this.processor = processor;
    }

    @Override
    public ResultDto process(final MailDto mailDto) {

        if(processor!=null){
            return processor.process(mailDto);
        }

        System.out.println("NO TYPE Evaluation");
        return  ResultDto.builder()
                .message("NO TYPE")
                .result(false)
                .build();

    }
}
