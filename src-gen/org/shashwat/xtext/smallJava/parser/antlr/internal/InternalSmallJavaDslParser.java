package org.shashwat.xtext.smallJava.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.shashwat.xtext.smallJava.services.SmallJavaDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmallJavaDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'final'", "'class'", "'extends'", "'{'", "'}'", "'[]'", "'String'", "'Integer'", "'Boolean'", "'Decimal'", "'BigDecimal'", "'public'", "'private'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSmallJavaDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSmallJavaDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSmallJavaDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g"; }



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



    // $ANTLR start "entryRuleSmallJava"
    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:68:1: entryRuleSmallJava returns [EObject current=null] : iv_ruleSmallJava= ruleSmallJava EOF ;
    public final EObject entryRuleSmallJava() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSmallJava = null;


        try {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:69:2: (iv_ruleSmallJava= ruleSmallJava EOF )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:70:2: iv_ruleSmallJava= ruleSmallJava EOF
            {
             newCompositeNode(grammarAccess.getSmallJavaRule()); 
            pushFollow(FOLLOW_ruleSmallJava_in_entryRuleSmallJava75);
            iv_ruleSmallJava=ruleSmallJava();

            state._fsp--;

             current =iv_ruleSmallJava; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSmallJava85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSmallJava"


    // $ANTLR start "ruleSmallJava"
    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:77:1: ruleSmallJava returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityTypes ) )? ( (lv_final_1_0= 'final' ) )? otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '{' ( (lv_attribute_7_0= ruleAttribute ) )* otherlv_8= '}' ) ;
    public final EObject ruleSmallJava() throws RecognitionException {
        EObject current = null;

        Token lv_final_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_attribute_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:80:28: ( ( ( (lv_visibility_0_0= ruleVisibilityTypes ) )? ( (lv_final_1_0= 'final' ) )? otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '{' ( (lv_attribute_7_0= ruleAttribute ) )* otherlv_8= '}' ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:81:1: ( ( (lv_visibility_0_0= ruleVisibilityTypes ) )? ( (lv_final_1_0= 'final' ) )? otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '{' ( (lv_attribute_7_0= ruleAttribute ) )* otherlv_8= '}' )
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:81:1: ( ( (lv_visibility_0_0= ruleVisibilityTypes ) )? ( (lv_final_1_0= 'final' ) )? otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '{' ( (lv_attribute_7_0= ruleAttribute ) )* otherlv_8= '}' )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:81:2: ( (lv_visibility_0_0= ruleVisibilityTypes ) )? ( (lv_final_1_0= 'final' ) )? otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '{' ( (lv_attribute_7_0= ruleAttribute ) )* otherlv_8= '}'
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:81:2: ( (lv_visibility_0_0= ruleVisibilityTypes ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=22 && LA1_0<=23)) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:82:1: (lv_visibility_0_0= ruleVisibilityTypes )
                    {
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:82:1: (lv_visibility_0_0= ruleVisibilityTypes )
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:83:3: lv_visibility_0_0= ruleVisibilityTypes
                    {
                     
                    	        newCompositeNode(grammarAccess.getSmallJavaAccess().getVisibilityVisibilityTypesEnumRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVisibilityTypes_in_ruleSmallJava131);
                    lv_visibility_0_0=ruleVisibilityTypes();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSmallJavaRule());
                    	        }
                           		set(
                           			current, 
                           			"visibility",
                            		lv_visibility_0_0, 
                            		"VisibilityTypes");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:99:3: ( (lv_final_1_0= 'final' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:100:1: (lv_final_1_0= 'final' )
                    {
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:100:1: (lv_final_1_0= 'final' )
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:101:3: lv_final_1_0= 'final'
                    {
                    lv_final_1_0=(Token)match(input,11,FOLLOW_11_in_ruleSmallJava150); 

                            newLeafNode(lv_final_1_0, grammarAccess.getSmallJavaAccess().getFinalFinalKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSmallJavaRule());
                    	        }
                           		setWithLastConsumed(current, "final", true, "final");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSmallJava176); 

                	newLeafNode(otherlv_2, grammarAccess.getSmallJavaAccess().getClassKeyword_2());
                
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:118:1: ( (lv_name_3_0= RULE_ID ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:119:1: (lv_name_3_0= RULE_ID )
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:119:1: (lv_name_3_0= RULE_ID )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:120:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSmallJava193); 

            			newLeafNode(lv_name_3_0, grammarAccess.getSmallJavaAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSmallJavaRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:136:2: (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:136:4: otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleSmallJava211); 

                        	newLeafNode(otherlv_4, grammarAccess.getSmallJavaAccess().getExtendsKeyword_4_0());
                        
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:140:1: ( (otherlv_5= RULE_ID ) )
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:141:1: (otherlv_5= RULE_ID )
                    {
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:141:1: (otherlv_5= RULE_ID )
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:142:3: otherlv_5= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSmallJavaRule());
                    	        }
                            
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSmallJava231); 

                    		newLeafNode(otherlv_5, grammarAccess.getSmallJavaAccess().getParentSmallJavaCrossReference_4_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleSmallJava245); 

                	newLeafNode(otherlv_6, grammarAccess.getSmallJavaAccess().getLeftCurlyBracketKeyword_5());
                
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:157:1: ( (lv_attribute_7_0= ruleAttribute ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||(LA4_0>=17 && LA4_0<=21)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:158:1: (lv_attribute_7_0= ruleAttribute )
            	    {
            	    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:158:1: (lv_attribute_7_0= ruleAttribute )
            	    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:159:3: lv_attribute_7_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSmallJavaAccess().getAttributeAttributeParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleSmallJava266);
            	    lv_attribute_7_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSmallJavaRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attribute",
            	            		lv_attribute_7_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleSmallJava279); 

                	newLeafNode(otherlv_8, grammarAccess.getSmallJavaAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSmallJava"


    // $ANTLR start "entryRuleAttribute"
    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:187:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:188:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:189:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute315);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute325); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:196:1: ruleAttribute returns [EObject current=null] : ( ( (lv_datatype_0_0= ruleDatatype ) ) ( (lv_array_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_array_1_0=null;
        Token lv_name_2_0=null;
        EObject lv_datatype_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:199:28: ( ( ( (lv_datatype_0_0= ruleDatatype ) ) ( (lv_array_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:200:1: ( ( (lv_datatype_0_0= ruleDatatype ) ) ( (lv_array_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:200:1: ( ( (lv_datatype_0_0= ruleDatatype ) ) ( (lv_array_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:200:2: ( (lv_datatype_0_0= ruleDatatype ) ) ( (lv_array_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) )
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:200:2: ( (lv_datatype_0_0= ruleDatatype ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:201:1: (lv_datatype_0_0= ruleDatatype )
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:201:1: (lv_datatype_0_0= ruleDatatype )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:202:3: lv_datatype_0_0= ruleDatatype
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getDatatypeDatatypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDatatype_in_ruleAttribute371);
            lv_datatype_0_0=ruleDatatype();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"datatype",
                    		lv_datatype_0_0, 
                    		"Datatype");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:218:2: ( (lv_array_1_0= '[]' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:219:1: (lv_array_1_0= '[]' )
                    {
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:219:1: (lv_array_1_0= '[]' )
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:220:3: lv_array_1_0= '[]'
                    {
                    lv_array_1_0=(Token)match(input,16,FOLLOW_16_in_ruleAttribute389); 

                            newLeafNode(lv_array_1_0, grammarAccess.getAttributeAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "array", true, "[]");
                    	    

                    }


                    }
                    break;

            }

            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:233:3: ( (lv_name_2_0= RULE_ID ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:234:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:234:1: (lv_name_2_0= RULE_ID )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:235:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute420); 

            			newLeafNode(lv_name_2_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleDatatype"
    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:259:1: entryRuleDatatype returns [EObject current=null] : iv_ruleDatatype= ruleDatatype EOF ;
    public final EObject entryRuleDatatype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatatype = null;


        try {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:260:2: (iv_ruleDatatype= ruleDatatype EOF )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:261:2: iv_ruleDatatype= ruleDatatype EOF
            {
             newCompositeNode(grammarAccess.getDatatypeRule()); 
            pushFollow(FOLLOW_ruleDatatype_in_entryRuleDatatype461);
            iv_ruleDatatype=ruleDatatype();

            state._fsp--;

             current =iv_ruleDatatype; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatatype471); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDatatype"


    // $ANTLR start "ruleDatatype"
    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:268:1: ruleDatatype returns [EObject current=null] : ( ( () ruleSimpleType ) | this_SmallJavaType_2= ruleSmallJavaType ) ;
    public final EObject ruleDatatype() throws RecognitionException {
        EObject current = null;

        EObject this_SmallJavaType_2 = null;


         enterRule(); 
            
        try {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:271:28: ( ( ( () ruleSimpleType ) | this_SmallJavaType_2= ruleSmallJavaType ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:272:1: ( ( () ruleSimpleType ) | this_SmallJavaType_2= ruleSmallJavaType )
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:272:1: ( ( () ruleSimpleType ) | this_SmallJavaType_2= ruleSmallJavaType )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=17 && LA6_0<=21)) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:272:2: ( () ruleSimpleType )
                    {
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:272:2: ( () ruleSimpleType )
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:272:3: () ruleSimpleType
                    {
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:272:3: ()
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:273:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getDatatypeAccess().getDatatypeAction_0_0(),
                                current);
                        

                    }

                     
                            newCompositeNode(grammarAccess.getDatatypeAccess().getSimpleTypeParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleSimpleType_in_ruleDatatype522);
                    ruleSimpleType();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:288:5: this_SmallJavaType_2= ruleSmallJavaType
                    {
                     
                            newCompositeNode(grammarAccess.getDatatypeAccess().getSmallJavaTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSmallJavaType_in_ruleDatatype550);
                    this_SmallJavaType_2=ruleSmallJavaType();

                    state._fsp--;

                     
                            current = this_SmallJavaType_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDatatype"


    // $ANTLR start "entryRuleSimpleType"
    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:304:1: entryRuleSimpleType returns [String current=null] : iv_ruleSimpleType= ruleSimpleType EOF ;
    public final String entryRuleSimpleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSimpleType = null;


        try {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:305:2: (iv_ruleSimpleType= ruleSimpleType EOF )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:306:2: iv_ruleSimpleType= ruleSimpleType EOF
            {
             newCompositeNode(grammarAccess.getSimpleTypeRule()); 
            pushFollow(FOLLOW_ruleSimpleType_in_entryRuleSimpleType586);
            iv_ruleSimpleType=ruleSimpleType();

            state._fsp--;

             current =iv_ruleSimpleType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleType597); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleType"


    // $ANTLR start "ruleSimpleType"
    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:313:1: ruleSimpleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'String' | kw= 'Integer' | kw= 'Boolean' | kw= 'Decimal' | kw= 'BigDecimal' ) ;
    public final AntlrDatatypeRuleToken ruleSimpleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:316:28: ( (kw= 'String' | kw= 'Integer' | kw= 'Boolean' | kw= 'Decimal' | kw= 'BigDecimal' ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:317:1: (kw= 'String' | kw= 'Integer' | kw= 'Boolean' | kw= 'Decimal' | kw= 'BigDecimal' )
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:317:1: (kw= 'String' | kw= 'Integer' | kw= 'Boolean' | kw= 'Decimal' | kw= 'BigDecimal' )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt7=1;
                }
                break;
            case 18:
                {
                alt7=2;
                }
                break;
            case 19:
                {
                alt7=3;
                }
                break;
            case 20:
                {
                alt7=4;
                }
                break;
            case 21:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:318:2: kw= 'String'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleSimpleType635); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeAccess().getStringKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:325:2: kw= 'Integer'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleSimpleType654); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeAccess().getIntegerKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:332:2: kw= 'Boolean'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleSimpleType673); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeAccess().getBooleanKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:339:2: kw= 'Decimal'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleSimpleType692); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeAccess().getDecimalKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:346:2: kw= 'BigDecimal'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleSimpleType711); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeAccess().getBigDecimalKeyword_4()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleType"


    // $ANTLR start "entryRuleSmallJavaType"
    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:359:1: entryRuleSmallJavaType returns [EObject current=null] : iv_ruleSmallJavaType= ruleSmallJavaType EOF ;
    public final EObject entryRuleSmallJavaType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSmallJavaType = null;


        try {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:360:2: (iv_ruleSmallJavaType= ruleSmallJavaType EOF )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:361:2: iv_ruleSmallJavaType= ruleSmallJavaType EOF
            {
             newCompositeNode(grammarAccess.getSmallJavaTypeRule()); 
            pushFollow(FOLLOW_ruleSmallJavaType_in_entryRuleSmallJavaType751);
            iv_ruleSmallJavaType=ruleSmallJavaType();

            state._fsp--;

             current =iv_ruleSmallJavaType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSmallJavaType761); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSmallJavaType"


    // $ANTLR start "ruleSmallJavaType"
    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:368:1: ruleSmallJavaType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleSmallJavaType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:371:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:372:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:372:1: ( (otherlv_0= RULE_ID ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:373:1: (otherlv_0= RULE_ID )
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:373:1: (otherlv_0= RULE_ID )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:374:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSmallJavaTypeRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSmallJavaType805); 

            		newLeafNode(otherlv_0, grammarAccess.getSmallJavaTypeAccess().getTypeSmallJavaCrossReference_0()); 
            	

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSmallJavaType"


    // $ANTLR start "ruleVisibilityTypes"
    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:393:1: ruleVisibilityTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) ) ;
    public final Enumerator ruleVisibilityTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:395:28: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:396:1: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) )
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:396:1: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            else if ( (LA8_0==23) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:396:2: (enumLiteral_0= 'public' )
                    {
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:396:2: (enumLiteral_0= 'public' )
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:396:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,22,FOLLOW_22_in_ruleVisibilityTypes854); 

                            current = grammarAccess.getVisibilityTypesAccess().getPUBLICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getVisibilityTypesAccess().getPUBLICEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:402:6: (enumLiteral_1= 'private' )
                    {
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:402:6: (enumLiteral_1= 'private' )
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:402:8: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,23,FOLLOW_23_in_ruleVisibilityTypes871); 

                            current = grammarAccess.getVisibilityTypesAccess().getPRIVATEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getVisibilityTypesAccess().getPRIVATEEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVisibilityTypes"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSmallJava_in_entryRuleSmallJava75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSmallJava85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibilityTypes_in_ruleSmallJava131 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_11_in_ruleSmallJava150 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSmallJava176 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSmallJava193 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleSmallJava211 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSmallJava231 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSmallJava245 = new BitSet(new long[]{0x00000000003E8010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleSmallJava266 = new BitSet(new long[]{0x00000000003E8010L});
    public static final BitSet FOLLOW_15_in_ruleSmallJava279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_ruleAttribute371 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleAttribute389 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_entryRuleDatatype461 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatatype471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_ruleDatatype522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSmallJavaType_in_ruleDatatype550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_entryRuleSimpleType586 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleType597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleSimpleType635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleSimpleType654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleSimpleType673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleSimpleType692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleSimpleType711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSmallJavaType_in_entryRuleSmallJavaType751 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSmallJavaType761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSmallJavaType805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleVisibilityTypes854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleVisibilityTypes871 = new BitSet(new long[]{0x0000000000000002L});

}