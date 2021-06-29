package dh.java.patterns.behavioral.chain.v1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MailProcessorTest {

    @Test
    public void shouldProcessMailsInOrder_withMailFromDH(){
        //Given
        final MailProcessor mailProcessor = new MailProcessor();
        final MailDto mailDto = MailDto.builder().mailType(MailType.DH).build();
        final ResultDto expected = ResultDto.builder()
                .message("DH")
                .result(true)
                .build();
        //When
        final ResultDto result = mailProcessor.process(mailDto);

        //Then
        assertThat(result).isEqualToComparingFieldByField(expected);
    }

    @Test
    public void shouldProcessMailsInOrder_withMailFromUBER(){
        //Given
        final MailProcessor mailProcessor = new MailProcessor();
        final MailDto mailDto = MailDto.builder().mailType(MailType.UBER).build();
        final ResultDto expected = ResultDto.builder()
                .message("NO TYPE")
                .result(false)
                .build();
        //When
        final ResultDto result = mailProcessor.process(mailDto);

        //Then
        assertThat(result).isEqualToComparingFieldByField(expected);
    }
}
