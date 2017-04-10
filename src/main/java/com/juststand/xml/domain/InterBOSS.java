package com.juststand.xml.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by juststand on 2017/4/10.
 */
@XmlRootElement(name = "InterBOSS")
public class InterBOSS {

    private SvcCont svcCont;

    @XmlElement(name = "SvcCont")
    public SvcCont getSvcCont() {
        return svcCont;
    }

    public void setSvcCont(SvcCont svcCont) {
        this.svcCont = svcCont;
    }

    @Override
    public String toString() {
        return "InterBOSS{" +
                "svcCont=" + svcCont +
                '}';
    }
}
