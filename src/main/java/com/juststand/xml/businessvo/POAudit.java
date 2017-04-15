package com.juststand.xml.businessvo;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by juststand on 2017/4/10.
 */
public class POAudit {

    private String auditor;
    private String auditTime;
    private String auditDesc;

    @XmlElement(name = "Auditor")
    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    @XmlElement(name = "AuditTime")
    public String getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(String auditTime) {
        this.auditTime = auditTime;
    }

    @XmlElement(name = "AuditDesc")
    public String getAuditDesc() {
        return auditDesc;
    }

    public void setAuditDesc(String auditDesc) {
        this.auditDesc = auditDesc;
    }

    @Override
    public String toString() {
        return "POAudit{" +
                "auditor='" + auditor + '\'' +
                ", auditTime='" + auditTime + '\'' +
                ", auditDesc='" + auditDesc + '\'' +
                '}';
    }
}
