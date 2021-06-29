package dh.java.patterns.behavioral.chain.v2.processor;

import dh.java.patterns.behavioral.chain.v2.model.MailDto;
import dh.java.patterns.behavioral.chain.v2.model.ResultDto;

import static dh.java.patterns.behavioral.chain.v2.model.MailType.FACEBOOK;

public class FacebookProcessor implements MailProcessor{

    private final MailProcessor processor;
    public FacebookProcessor(){
        this.processor = null;
    }
    public FacebookProcessor(final MailProcessor processor){
        this.processor = processor;
    }

    @Override
    public ResultDto process(final MailDto mailDto) {
        System.out.println("FACEBOOK Evaluation");
        if(FACEBOOK.equals(mailDto.getMailType())){
            return ResultDto.builder()
                    .message("FACEBOOK")
                    .result(false)
                    .build();
        }

        if(processor!=null){
            return processor.process(mailDto);
        }

        return new NoTypeProcessor().process(mailDto);
    }
}
