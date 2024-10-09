package Chapter28;

import java.util.Optional;

class ConInfo{
    Optional<String> phone;
    Optional<String> adrs;

    public ConInfo(Optional<String> ph, Optional<String> ad){
        phone = ph;
        adrs = ad;
    }
    public Optional<String> getPhone() { return phone; }
    public Optional<String> getAdrs() { return adrs; }
}

public class FlatMapElseOptional {
    public static void main(String[] args){
        Optional<ConInfo> ci = Optional.of(
            new ConInfo(Optional.ofNullable(null), Optional.of("Republic of Korea"))
        );

        String phone = ci.flatMap(c -> c.getPhone()).orElse("There is no phone number");
        String addr = ci.flatMap(c -> c.getAdrs()).orElse("There is no address.");
        System.out.println(phone);
        System.out.println(addr);
    }
}
