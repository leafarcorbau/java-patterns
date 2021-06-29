package dh.java.patterns.behavioral.chain.v2.processor;

import dh.java.patterns.behavioral.chain.v2.model.ResultDto;
import dh.java.patterns.behavioral.chain.v2.model.MailDto;

import static dh.java.patterns.behavioral.chain.v2.model.MailType.DW;

public class DWProcessor implements MailProcessor{
    private final MailProcessor processor;

    public DWProcessor(){
        this.processor = null;
    }
    public DWProcessor(final MailProcessor processor){
        this.processor = processor;
    }

    @Override
    public ResultDto process(final MailDto mailDto) {

        System.out.println("DW Evaluation");
        if(DW.equals(mailDto.getMailType())){
            return ResultDto.builder()
                    .message("DW")
                    .result(false)
                    .build();
        }

        if(processor!=null){
            return processor.process(mailDto);
        }

        return new NoTypeProcessor().process(mailDto);
    }
}
