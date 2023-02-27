package com.knownsense.springldaps;

import org.springframework.aot.hint.MemberCategory;
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;
import org.springframework.aot.hint.TypeReference;

public class MyHint implements RuntimeHintsRegistrar {
    @Override
    public void registerHints(RuntimeHints hints, ClassLoader classLoader) {
        hints.reflection().registerType(TypeReference.of("javax.net.ssl.SSLSocketFactory"), builder -> builder.withMembers(MemberCategory.INVOKE_PUBLIC_METHODS));

    }
}
