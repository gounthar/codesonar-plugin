package org.jenkinsci.plugins.codesonar.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

/**
 * @author aseno
 *
 */
public class CodeSonarAlertData {
    public enum Color {
        @SerializedName("RED") RED,
        @SerializedName("YELLOW") YELLOW,
        @SerializedName("BLUE") BLUE,
        @SerializedName("GREEN") GREEN
    }
    
    private String message;
    private long analysis_id;
    private Color color;
    private long id;
    private List<CodeSonarUndefinedFunction> undef_funcs;
    private List<String> issues;
    private List<String> facts;
    
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public long getAnalysis_id() {
        return analysis_id;
    }
    public void setAnalysis_id(long analysis_id) {
        this.analysis_id = analysis_id;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public List<CodeSonarUndefinedFunction> getUndef_funcs() {
        return undef_funcs;
    }
    public void setUndef_funcs(List<CodeSonarUndefinedFunction> undef_funcs) {
        this.undef_funcs = undef_funcs;
    }
    public List<String> getIssues() {
        return issues;
    }
    public void setIssues(List<String> issues) {
        this.issues = issues;
    }
    public List<String> getFacts() {
        return facts;
    }
    public void setFacts(List<String> facts) {
        this.facts = facts;
    }
    
    @Override
    public String toString() {
        return "CodeSonarAlertData [message=" + message + ", analysis_id=" + analysis_id + ", color=" + color + ", id="
                + id + ", undef_funcs=" + undef_funcs + ", issues=" + issues + ", facts=" + facts + "]";
    }

}
