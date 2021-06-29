package dh.java.patterns.behavioral.chain.v2;

import dh.java.patterns.behavioral.chain.v2.model.MailDto;
import dh.java.patterns.behavioral.chain.v2.model.MailType;
import dh.java.patterns.behavioral.chain.v2.model.ResultDto;
import dh.java.patterns.behavioral.chain.v2.processor.*;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MailProcessorTest {

    @Test
    public void shouldProcessMailsInOrder_withMailFromDH(){
        //Given
        final MailProcessor dhProcessor_3 = new DHProcessor();
        final MailProcessor facebookProcessor_2 = new FacebookProcessor(dhProcessor_3);
        final MailProcessor dwProcessor_1 = new DWProcessor(facebookProcessor_2);

        final MailDto mailDto = MailDto.builder().mailType(MailType.DH).build();
        final ResultDto expected = ResultDto.builder()
                .message("DH")
                .result(true)
                .build();
        //When
        final ResultDto result = dwProcessor_1.process(mailDto);

        //Then
        assertThat(result).isEqualToComparingFieldByField(expected);
    }

    @Test
    public void shouldProcessMailsInOrder_withMailFromUBER(){
        //Given
        final MailProcessor dhProcessor_3 = new DHProcessor();
        final MailProcessor facebookProcessor_2 = new FacebookProcessor(dhProcessor_3);
        final MailProcessor dwProcessor_1 = new DWProcessor(facebookProcessor_2);

        final MailDto mailDto = MailDto.builder().mailType(MailType.UBER).build();
        final ResultDto expected = ResultDto.builder()
                .message("NO TYPE")
                .result(false)
                .build();
        //When
        final ResultDto result = dwProcessor_1.process(mailDto);

        //Then
        assertThat(result).isEqualToComparingFieldByField(expected);
    }
}
