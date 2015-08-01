/*
 * generated by Xtext
 */
grammar InternalSmallJavaDsl;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.shashwat.xtext.smallJava.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.shashwat.xtext.smallJava.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.shashwat.xtext.smallJava.services.SmallJavaDslGrammarAccess;

}

@parser::members {

 	private SmallJavaDslGrammarAccess grammarAccess;
 	
    public InternalSmallJavaDslParser(TokenStream input, SmallJavaDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "SmallJava";	
   	}
   	
   	@Override
   	protected SmallJavaDslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleSmallJava
entryRuleSmallJava returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSmallJavaRule()); }
	 iv_ruleSmallJava=ruleSmallJava 
	 { $current=$iv_ruleSmallJava.current; } 
	 EOF 
;

// Rule SmallJava
ruleSmallJava returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='class' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getSmallJavaAccess().getClassKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getSmallJavaAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSmallJavaRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(	otherlv_2='extends' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getSmallJavaAccess().getExtendsKeyword_2_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getSmallJavaRule());
	        }
        }
	otherlv_3=RULE_ID
	{
		newLeafNode(otherlv_3, grammarAccess.getSmallJavaAccess().getParentSmallJavaCrossReference_2_1_0()); 
	}

)
))?	otherlv_4='{' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getSmallJavaAccess().getLeftCurlyBracketKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSmallJavaAccess().getAttributeAttributeParserRuleCall_4_0()); 
	    }
		lv_attribute_5_0=ruleAttribute		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSmallJavaRule());
	        }
       		add(
       			$current, 
       			"attribute",
        		lv_attribute_5_0, 
        		"Attribute");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getSmallJavaAccess().getRightCurlyBracketKeyword_5());
    }
)
;





// Entry rule entryRuleAttribute
entryRuleAttribute returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAttributeRule()); }
	 iv_ruleAttribute=ruleAttribute 
	 { $current=$iv_ruleAttribute.current; } 
	 EOF 
;

// Rule Attribute
ruleAttribute returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getAttributeAccess().getDatatypeDatatypeParserRuleCall_0_0()); 
	    }
		lv_datatype_0_0=ruleDatatype		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAttributeRule());
	        }
       		set(
       			$current, 
       			"datatype",
        		lv_datatype_0_0, 
        		"Datatype");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAttributeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleDatatype
entryRuleDatatype returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getDatatypeRule()); } 
	 iv_ruleDatatype=ruleDatatype 
	 { $current=$iv_ruleDatatype.current.getText(); }  
	 EOF 
;

// Rule Datatype
ruleDatatype returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='String' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDatatypeAccess().getStringKeyword_0()); 
    }

    |
	kw='Integer' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDatatypeAccess().getIntegerKeyword_1()); 
    }

    |
	kw='Boolean' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDatatypeAccess().getBooleanKeyword_2()); 
    }

    |
	kw='Decimal' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDatatypeAccess().getDecimalKeyword_3()); 
    }

    |
	kw='BigDecimal' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDatatypeAccess().getBigDecimalKeyword_4()); 
    }
)
    ;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


