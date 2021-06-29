package dh.java.patterns.behavioral.chain.v2.processor;

import dh.java.patterns.behavioral.chain.v2.model.MailDto;
import dh.java.patterns.behavioral.chain.v2.model.ResultDto;

public interface MailProcessor {

    ResultDto process(final MailDto mailDto);
}
