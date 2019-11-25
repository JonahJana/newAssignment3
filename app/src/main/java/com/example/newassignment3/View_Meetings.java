package com.example.newassignment3;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.lang.reflect.Array;
import java.sql.Time;
import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link View_Meetings.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link View_Meetings#newInstance} factory method to
 * create an instance of this fragment.
 */
public class View_Meetings extends Fragment {

    private OnFragmentInteractionListener mListener;

    public View_Meetings() {
        // Required empty public constructor
    }

    public static View_Meetings newInstance(String param1, String param2) {
        View_Meetings fragment = new View_Meetings();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ArrayList<String> Attendees = new ArrayList<>();
        Attendees.add("andy");
        Attendees.add("joie");
        Attendees.add("iip");
        Attendees.add("hap");

        ArrayList<meetingItem> meetingList = new ArrayList<>();
        meetingList.add(new meetingItem("meeting1", 2, Attendees, 3,4, "location"));


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_view__meetings, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(String uri) {
        if (mListener != null) {
            mListener.onViewFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onViewFragmentInteraction(String string);
    }
}
