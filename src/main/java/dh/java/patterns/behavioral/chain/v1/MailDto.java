package dh.java.patterns.behavioral.chain.v1;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Value;

@Value
@Getter
@Builder
@RequiredArgsConstructor
public class MailDto {
    String text;
    MailType mailType;
}
